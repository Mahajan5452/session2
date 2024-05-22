package state;

public class Canvas {
  //  private  ToolType currentTool;
  private Tool currentTool;

  public void mouseDown() {
//    if (currentTool == ToolType.SELECTION) {
//      System.out.println("Selection icon");
//    } else if (currentTool == ToolType.BRUSH) {
//      System.out.println("Brush Type");
//    } else if (currentTool == ToolType.ERASER) {
//      System.out.println("Eraser Type");
//    }
    currentTool.mouseDown();
  }

  public void mouseUp() {
    // more tools we support we have to add more and more if else
    // not a good way
    // we will use polymorphism to solve this
//    if (currentTool == ToolType.SELECTION) {
//      System.out.println("Draw dashed rectangle");
//    } else if (currentTool == ToolType.BRUSH) {
//      System.out.println("Draw a line ");
//    } else if (currentTool == ToolType.ERASER) {
//      System.out.println("Erase something ");
//    }
    currentTool.mouseUp();
  }

  public void setCurrentTool(Tool currentTool) {
    this.currentTool = currentTool;
  }

  public Tool getCurrentTool() {
    return currentTool;
  }
}
