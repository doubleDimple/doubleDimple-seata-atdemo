springboot集成seata
在执行的过程中,发现分支事务会有失败的问题
主要原因是因为,feign调用的情况下,全局的xid没有传递导致,所以需要引入
spring-cloud-starter-alibaba-seata依赖用于传递xid,而且只要在调用方加一个GlobalTransactional注解即可
增加了对nacos配置中心的支持,以及多环境的切换配置
