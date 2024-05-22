import memento.Editor;
import memento.History;
import state.Canvas;
import state.SelectionTool;

public class Main {
//  public static void main(String[] args) {
//    //memento Pattern , think how can undo the state
//
//    //solution:
//    //create a state and maintain that state and  a list to store previous objects
//
//    var editor = new Editor();
//    var history = new History();
//
//    editor.setContent("a");
//    history.push(editor.createState());
//
//    editor.setContent("b");
//    history.push(editor.createState());
//    editor.setContent("c");
//    editor.restore(history.pop());
//    System.out.println(editor.getContent());
//  }
public static void main(String[] args) {
  var canvas = new Canvas();
  canvas.setCurrentTool(new SelectionTool());
  canvas.mouseDown();
  canvas.mouseUp();
}
}