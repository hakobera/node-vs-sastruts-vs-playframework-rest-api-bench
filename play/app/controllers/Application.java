package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	renderJSON(Order.findAll());
    }

    public static void show(Long id) {
    	renderJSON(Order.findById(id));
    }

}