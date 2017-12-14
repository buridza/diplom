package by.htp.library.controller.command.impl;

import by.htp.library.bean.User;
import by.htp.library.controller.command.Command;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;

public class RegistrationCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		String login = params[1];
		String password = params[2];
		String name = params[3];
		String name = params[3];
		String name = params[3];
		String name = params[3];
		String name = params[3];
		String response = null;
		try {
			userService.registration(new User(login, password, dob, ));
			response = "true";
		} catch (ServiceException e) {
			response = "Sorry, ....";
		}

		return response = "false";

	}

}
