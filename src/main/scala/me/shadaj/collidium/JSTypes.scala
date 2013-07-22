package me.shadaj.collidium

import js.Dynamic.{ global => g }
import scala.js._

import scala.language.implicitConversions

import scala.annotation.tailrec
import scala.js

import Math._

trait Window extends js.Object {
  val document: DOMDocument

  def alert(msg: js.String): Unit

  def setInterval[U](function: js.Function0[U], interval: js.Number)
}

trait DOMDocument extends js.Object {
  def getElementById(id: js.String): DOMElement
  def createElement(tag: js.String): DOMElement
}

trait DOMElement extends js.Object {
  var innerHTML: js.String

  def appendChild(child: DOMElement): Unit

  var onmousedown: js.Function1[MouseEvent, Boolean]
  var onmousemove: js.Function1[MouseEvent, Boolean]
  var onmouseup: js.Function1[MouseEvent, Boolean]

  def addEventListener(event: js.String, toDo: js.Function1[js.Dynamic, Boolean], someBoolean: Boolean)

  def pageXOffset: js.Number
  def pageYOffset: js.Number
}

trait JQueryStatic extends js.Object {
  def apply(arg: js.Any): JQuery
  def apply(arg: js.Any, attributes: js.Dictionary): JQuery
}

trait JQuery extends js.Object {
  def get(index: js.Number): DOMElement

  def text(value: js.String): JQuery
  def text(): js.String

  def html(value: js.String): JQuery
  def html(): js.String

  def prop(property: js.String): js.Any
  def prop(property: js.String, value: js.Any): JQuery

  def offset(): JQueryOffset

  def appendTo(parent: JQuery): JQuery
  def append(children: JQuery): JQuery

  def addClass(classes: js.String): JQuery
  def removeClass(classes: js.String): JQuery

  def each[U](callback: js.Function2[js.Number, js.Dynamic, U]): JQuery

  def click[U](handler: js.Function0[U]): JQuery
  def click[U](handler: js.Function1[JQueryEvent, U]): JQuery
}

trait JQueryOffset extends js.Object {
  val top: js.Number
  val left: js.Number
}

trait JQueryEvent extends js.Object {
  val pageX: js.Number
  val pageY: js.Number
}

trait HTMLCanvasElement extends DOMElement {
  def getContext(kind: js.String): js.Any // depends on the kind
}

trait Canvas2D extends js.Object {
  val canvas: HTMLCanvasElement

  var fillStyle: js.String
  var lineWidth: js.Number
  var strokeStyle: js.String

  def fillRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number)
  def strokeRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number)

  def beginPath()
  def fill()
  def stroke()

  def moveTo(x: js.Number, y: js.Number)
  def lineTo(x: js.Number, y: js.Number)

  def arc(x: js.Number, y: js.Number, radius: js.Number,
      startAngle: js.Number, endAngle: js.Number, anticlockwise: js.Boolean)
}

trait MouseEvent extends js.Object {
  val layerX: js.Number
  val layerY: js.Number
  val pageX: js.Number
  val pageY: js.Number
  val clientX: js.Number
  val clientY: js.Number
  def preventDefault(): Unit
}

trait AudioElement extends DOMElement {
  def play()
  def pause()
  var currentTime: js.Number
}

trait JSON extends js.Object {
  def parse(string: js.String): js.Dynamic
}

