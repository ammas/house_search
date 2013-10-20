package controllers

import org.apache.nutch.crawl.InjectorJob
import play.api._
import play.api.mvc._
import javax.inject.Singleton

@Singleton
class Application () extends Controller {

  def index = Action {
    
    // testing nutch library
    
    
    
    
    Ok(views.html.index("Your new application is ready."))
  }

}