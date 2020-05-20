package main.java.com.xtgj.j2ee.chapter10.aspect;

import org.aspectj.lang.JoinPonit;
import org.aspectj.lang.ProceedingJoinPoint;

import java.io.ObjectInput;

public class LogPrint {
	// 定义前置通知
	public void doAccessCheck(JoinPoint jp) {
//		System.out.println("doAccessCheck");

		Object[] objects = jp.getArgs();
		for(Object obj:objects){
			System.out.println("doAccessCheck");
			System.out.println(obj.toString());
		}
		System.out.println("");
	}

	// 定义后置通知
	public void doReturnCheck(JoinPoint jp) {
		System.out.println("doReturnCheck");
	}

	// 定义例外通知
	public void doExceptionAction(JoinPoint jp) {
		System.out.println("doExceptionAction");
	}

	// 定义最终通知
	public void doReleaseAction() {
		System.out.println("doReleaseAction");
	}

	// 环绕通知
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("doReleaseAction");
		return pjp.proceed();
	}
}
