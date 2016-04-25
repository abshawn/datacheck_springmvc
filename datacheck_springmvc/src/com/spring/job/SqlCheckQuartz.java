package com.spring.job;
import com.spring.action.HelloWorldAction;

public class SqlCheckQuartz {

	//**************************************************************************
	/**
	 * TODO 定时任务 <br><pre>
	 * 方法executejob每隔10分钟执行一次，对配置的数据库的sql循环执行一次<br>
	 * 编写者：张南
	 * 创建时间：2016-4-21 下午2:31:24 </pre>
	 * @param 参数类型 参数名 说明
	 * @return void 说明
	 * @throws 异常类型 说明
	 */
	//**************************************************************************	
	
	// 用户信息类
	
 	protected void executejob() {
 	    try{  
 	    	System.out.println("this is test schedule");
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  		
	}
}
