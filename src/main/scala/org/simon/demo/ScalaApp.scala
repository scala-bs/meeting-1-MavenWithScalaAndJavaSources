package org.simon.demo;

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var person: Person = new Person("Jane");
    System.out.println("Hello " + person.getName());
  }
}