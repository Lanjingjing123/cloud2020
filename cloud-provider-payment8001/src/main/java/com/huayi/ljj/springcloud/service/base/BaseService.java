package com.huayi.ljj.springcloud.service.base;

import com.huayi.ljj.springcloud.service.IService;
import com.huayi.ljj.springcloud.service.IServiceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import javax.annotation.Resource;

public abstract class BaseService implements IService {

    private static final Logger LOG = LoggerFactory.getLogger(BaseService.class);
    @Resource
    private PlatformTransactionManager platformTransactionManager;

    @Resource
    private TransactionDefinition transactionDefinition;

    /**
     * 业务类重写此方法
     */
    public abstract void action (IServiceContext context) throws Exception;

    @Override
    public void execute(IServiceContext context) throws Exception {
        TransactionStatus transactionStatus = null;
        /** 1.开启事务*/
        transactionStatus = enableTransAction(context);
        try {
            /** 2.业务执行交易*/
             action(context);
             /** 3. 提交事务*/
             commitTransAction(transactionStatus);

             // 4. 未发生一场
        }catch (Exception e){

            if (null!=transactionStatus){
                /** 发生异常回滚事务*/
                rollbackTransAction(transactionStatus);
            }

            throw e;

        }


    }



    /**
     * 交易前开启事务
     * @param context
     */
    public  TransactionStatus  enableTransAction(IServiceContext context){
        LOG.info("enable transaction begin >>>>>>>>>>>>>>>>>>>>>>>>>>");
        TransactionStatus transactionStatus =   platformTransactionManager.getTransaction(transactionDefinition);
        LOG.info("enable transaction end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return  transactionStatus;
    }

    /**
     *
     * @param transactionStatus
     */
    public void rollbackTransAction(TransactionStatus transactionStatus){
        LOG.info("transaction rollback begin >>>>>>>>>>>>>>>>>>");
        platformTransactionManager.rollback(transactionStatus);
        LOG.info("transaction rollback end <<<<<<<<<<<<<<<<<<");
    }

    /**
     *
     * @param transactionStatus
     */
    public void commitTransAction(TransactionStatus transactionStatus){
        LOG.info("transaction commit begin >>>>>>>>>>>>>>>>");
        platformTransactionManager.commit(transactionStatus);
        LOG.info("transaction commit end <<<<<<<<<<<<<<<<<<");
    }

}
