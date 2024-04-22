package com.azure.csu.tiger.common.utils;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisLockUtil {

    private static final Logger logger = LoggerFactory.getLogger(RedisLockUtil.class);
    @Autowired
    private RedissonClient redissonClient;

    //lock(), 拿不到lock就不罢休，不然线程就一直block
    public RLock lock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock();
        return lock;
    }

    //leaseTime为加锁时间，单位为秒
    public RLock lock(String lockKey, long leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(leaseTime, TimeUnit.SECONDS);
        return lock;
    }

    //leaseTime为加锁时间，时间单位由unit确定
    public RLock lock(String lockKey, TimeUnit unit, long leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(leaseTime, unit);
        return lock;
    }

    //带时间限制的tryLock()，拿不到lock，就等一段时间，超时返回false.
    public boolean tryLock(String lockKey, TimeUnit unit, long waitTime) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    //带时间限制的tryLock()，拿不到lock，就等一段时间，超时返回false.
    public boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    //tryLock()，马上返回，拿到lock就返回true，不然返回false。
    public boolean tryLock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock();
        } catch (Exception e) {
            return false;
        }
    }

    public void unlock(String lockKey) {
        try {
            RLock lock = redissonClient.getLock(lockKey);
            if (lock.isLocked()) {
                lock.unlock();
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    //判断要解锁的key是否已被锁定
    public boolean isLocked(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        return lock.isLocked();
    }

    //判断要解锁的key是否被当前线程持有
    public boolean isHeldByCurrentThread(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        return lock.isHeldByCurrentThread();
    }

    public void unlock(RLock lock) {
        lock.unlock();
    }

}
