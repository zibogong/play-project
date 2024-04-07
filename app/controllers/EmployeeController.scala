package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._
import services._

class EmployeeController @Inject() (
    employeeService: EmployeeSerivce,
  cc: ControllerComponents
) extends AbstractController(cc) {
  def employeeList = Action { implicit request: Request[AnyContent] =>
    val employees = employeeService.getEmployees()
    Ok(views.html.employeeList(employees))
  }
}
