package services

import models._

class EmployeeSerivce {

  val jilen = Employee(
    id = 1,
    name = "Jilen",
    sex = "male",
    position = "SDE"
  )

  val yison = Employee(
    id = 2,
    name = "Yison",
    sex = "female",
    position = "DS"
  )

  val shaw = Employee(
    id = 3,
    name = "Shaw",
    sex = "male",
    position = "worker"
  )

  def getEmployees(): Seq[Employee] = Seq(jilen, yison, shaw)
}