package com.imooc.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NioSocketAcceptor acceptor = new NioSocketAcceptor();
			acceptor.setHandler(new MyServerHandler());
			acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory()));;
			acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 5);
			acceptor.bind(new InetSocketAddress(9898));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
