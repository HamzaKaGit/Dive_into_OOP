class circle implements shapeA, shapeB, shapeC {
public void Draw() {

// Try to change ,will get error because baseclass is final

//baseclass = "Trying-To-Change Vlaue"

System.out.println("Drawing Circle here:" + shapeA.baseclass);
}
@Override
public void Draw2() {
System.out.println("Drawing Circle here:" + shapeB.baseclass);
}
@Override
public void Draw3() {
System.out.println("Drawing Circle here:" + shapeC.baseclass);
}
}
