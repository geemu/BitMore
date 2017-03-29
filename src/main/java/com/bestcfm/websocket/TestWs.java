package com.bestcfm.websocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.bestcfm.bean.User;

@ServerEndpoint(value = "/ws", configurator = HttpSessionConfig.class)
public class TestWs {

	private static Map<Integer, Session> sessions = new HashMap<>();

	@OnOpen
	public void onopen(Session session, EndpointConfig config) {
		System.out.println("ws open");
		HttpSession httpSession = (HttpSession) config.getUserProperties().get("httpSession");
		if (httpSession == null) {
			onclose(session);
			return;
		}
		User user = (User) httpSession.getAttribute("user");
		session.getUserProperties().put("userId", user.getId());
		sessions.put(user.getId(), session);
	}

	@OnMessage
	public void onmessage(Session session, String message) {
		System.out.println("ws getMessage");
		int userId = 1;
		Session target = sessions.get(userId);
		try {
			target.getBasicRemote().sendText(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@OnClose
	public void onclose(Session session) {
		System.out.println("ws close");
		int userId = Integer.parseInt(session.getUserProperties().get("userId").toString());
		sessions.remove(userId);
	}

	@OnError
	public void onerror(Session session, Throwable e) {

	}

}
