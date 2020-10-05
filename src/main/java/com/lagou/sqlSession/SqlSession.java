package com.lagou.sqlSession;

import java.util.List;

public interface SqlSession {

    //增加
    public int insert(String statementid,Object... params) throws Exception;


    //更新
    public int update(String statementid,Object... params) throws Exception;

    //删除
    public int delete(String statementid,Object... params) throws Exception;



    //查询所有
    public <E> List<E> selectList(String statementid,Object... params) throws Exception;

    //根据条件查询单个
    public <T> T selectOne(String statementid,Object... params) throws Exception;


    //为Dao接口生成代理实现类
    public <T> T getMapper(Class<?> mapperClass);




}