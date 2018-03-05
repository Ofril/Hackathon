package controllers;

import io.ebean.Ebean;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {

	public Result getAll() {
		
		return ok(Json.toJson(Ebean.find(User.class).findList()));
	}
}
