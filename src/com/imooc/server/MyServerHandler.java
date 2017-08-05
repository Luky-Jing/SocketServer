package com.imooc.server;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MyServerHandler extends IoHandlerAdapter {

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		// TODO Auto-generated method stub
//		super.exceptionCaught(session, cause);
		System.out.println("exceptionCaught");
	}

	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
//		super.messageReceived(session, message);
		String s = (String)message;
		System.out.println("messageReceived " + s);
		session.write("server reply: " + s);
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
//		super.messageSent(session, message);
		System.out.println("messageSent");
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		// TODO Auto-generated method stub
//		super.sessionClosed(session);
		System.out.println("sessionClosed");
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		// TODO Auto-generated method stub
//		super.sessionCreated(session);
		System.out.println("sessionCreated");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		// TODO Auto-generated method stub
//		super.sessionIdle(session, status);
		System.out.println("sessionIdle");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		// TODO Auto-generated method stub
//		super.sessionOpened(session);
		System.out.println("sessionOpened");
	}
	
}
