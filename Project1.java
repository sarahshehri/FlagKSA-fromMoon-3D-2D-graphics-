/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.Duration;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import static javafx.scene.input.KeyCode.W;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import static javafx.scene.input.MouseEvent.MOUSE_CLICKED;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javax.swing.Timer;



/**
 *
 * @author DELL
 */
public class Project1 extends Application {
   
    
      private static final int w = 800;
      private static final int h = 500;

    @Override
    public void start(Stage primaryStage) {
       
        
        
        
        AmbientLight ambLight =new  AmbientLight(Color.WHITE);
        PointLight pLight= new PointLight(Color.WHITE);
         //setting the point light postion
          pLight.getTransforms().add(new Translate(903,160,50));
         // group.getChildren().addAll(ambLight,pLight);


   // sunlight

AmbientLight ambLightt;
ambLightt = new  AmbientLight(Color.YELLOW);

// setting the point light

PointLight pLightt= new PointLight(Color.WHITE);

//setting the point light postion

pLightt.getTransforms().add(new Translate(200,150,-50));



//earth   
Sphere earth = new Sphere(40, 100);
earth.setTranslateX(-1* w / 3 + 200.0);
earth.setTranslateY(w /664);
earth.setTranslateZ(50);
        //earth pic
Image ii = new Image("map.jpg");
PhongMaterial mat5 = new PhongMaterial();
mat5.setDiffuseMap(ii);
earth.setMaterial(mat5);
//حركة الارض
Path path = new Path();
        MoveTo move = new MoveTo(300, 100);
        LineTo line1 = new LineTo(500, 195);
        LineTo line2 = new LineTo(300, 290);
        LineTo line3 = new LineTo(200,195);
        LineTo line4 = new LineTo(300, 100);
        path.getElements().addAll(move, line1, line2, line3, line4);
        
        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(earth);
        pathTransition.setPath(path);
       pathTransition.setCycleCount(-1);
        //  تشغيل التأثير   
        pathTransition.play();
        
      










// sun object
//the sun ( drawing a sphere and sitting it,s dimention)
Sphere sun = new Sphere(80, 50);
sun.setTranslateX( -10* w / 28 + 80.0);
sun.setTranslateY(w / 80);
sun.setTranslateZ(10);



// colore for sun


//diiffuse and spcular color
PhongMaterial mat2 = new PhongMaterial();
mat2.setDiffuseColor(Color.ORANGE);
mat2.setSpecularColor(Color.YELLOW);
sun.setMaterial(mat2);

//box
  // Box box2=new Box(70,100,10);
       // box2.setTranslateX(-13* w / 28 + 100.0);
       // box2.setTranslateY(w/100);
        //box2.setTranslateZ(10);
        //Sphere moon = new Sphere(100, 70);
//moon.setTranslateX( 1 * w / 8 + 100.0);
//moon.setTranslateY(w / 28);
//moon.setTranslateZ(180);

 Box box =new Box(150,88,88);
box.setTranslateX(WIDTH/-48);
box.setTranslateY(315);
box.setTranslateZ(1100);

        Cylinder cylinder=new Cylinder(12,130);
       cylinder.setTranslateX(-45);
cylinder.setTranslateY(400);
cylinder.setTranslateZ(800);

////////////PREemtive SHAPE

Rectangle r = new Rectangle(300,70,150,6);
r.setTranslateX(WIDTH/-48);
r.setTranslateY(270);
r.setTranslateZ(1000);
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLACK);
        
        
  PhongMaterial mat1 = new PhongMaterial();
        mat1.setSpecularColor(Color.LIGHTSEAGREEN);
       mat1.setDiffuseColor(Color.WHITESMOKE);
       cylinder.setMaterial(mat1);




                Image image =new Image("kk.jpeg");

        PhongMaterial mat4 = new PhongMaterial();
        mat4.setDiffuseMap(image);
        mat4.setBumpMap(image);
        box.setMaterial(mat4);
                        mat1.setSpecularColor(Color.DARKGREEN);











        Image img3=new Image("moon.jpeg");
        PhongMaterial mat=new  PhongMaterial();
        mat.setDiffuseMap(img3);
       // moon.setMaterial(mat);// extra

ImageView imaVI2=new ImageView(img3);
imaVI2.setFitWidth(w+w*0.45);
imaVI2.setFitHeight(h/3);
imaVI2.setTranslateX(-49);
imaVI2.setTranslateY(400);
imaVI2.setTranslateZ(600);

  Image ima=new Image("aa.jpeg");   
 // ImageView imaVI =new ImageView(ima);
 // imaVI.setPreserveRatio(true);
  //imaVI.getTransforms().add(new Translate( ima.getWidth()/2, ima.getHeight()/2, 1000));
//Box bBack =new Box();
//bBack.setHeight(500);
//bBack.setWidth(800);
//bBack.setDepth(700);

//PhongMaterial mat6 = new PhongMaterial();
//mat6.setDiffuseMap(ima);
//bBack.setMaterial(mat6);
StackPane sp=new StackPane();
ImageView imaVI=new ImageView(ima);
imaVI.setFitWidth(w);
imaVI.setFitHeight(h);
imaVI.setTranslateX(00);
imaVI.setTranslateY(00);
imaVI.setTranslateZ(0);
//sp.getChildren().add(imaVI);

Group group = new Group();
sp.getChildren().add(imaVI);
sp.getChildren().add(earth);
//group.setAlignment(earth , Pos.BASELINE_CENTER);
sp.getChildren().add(pLight);
sp.getChildren().add(ambLight);
sp.getChildren().add(pLightt);
//sp.setAlignment(pLightt , Pos.BOTTOM_RIGHT);
sp.getChildren().add(ambLightt);
sp.getChildren().add(sun);

//sp.setAlignment(sun , Pos.CENTER);
sp.getChildren().add(imaVI2);
//sp.setAlignment(moon,Pos.BOTTOM_CENTER);
 sp.getChildren().addAll(box,r ,cylinder);
group.getChildren().add(sp);
        group.getChildren().addAll(earth);







//earth controler
          primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event->{
             switch (event.getCode()){
                case A:
                     pLight.setColor(Color.BLUE);
                 break;

               case S:
                     pLight.setColor(Color.YELLOW);
                 break;
               case D:
                     pLight.setColor(Color.GREEN);

                 break;
               case F:
          pLight.setColor(Color.BROWN);
               //case LEFT:
                 //  earth.setRotationAxis(Rotate.Y_AXIS);{
                   //earth.setRotate(group.getRotate() + 10);
              
                

             }

          });

          primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event->{
             switch (event.getCode()){
                case O:
                     ambLight.setLightOn(!ambLight.isLightOn());
                 break;



             }

          });

          
///////////////////////////////////////////////////////MOUSE//////////////////////////////////
//primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {



//if (event.getButton() == MouseButton.PRIMARY) {
//group.setRotationAxis(Rotate.X_AXIS);
//} else if (event.getButton() == MouseButton.SECONDARY) {
//group.setRotationAxis(Rotate.Y_AXIS);
//} else {
//group.setRotationAxis(Rotate.Z_AXIS);
//}
//group.setRotate(group.getRotate() +50);



//});


 primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {

 switch (event.getCode()) {

 case RIGHT:


earth.setRotationAxis(Rotate.Y_AXIS);

sun.setRotationAxis(Rotate.Z_AXIS);
//}

earth.setRotate(earth.getRotate() +50);
 break;
 



 }

 });

     





 //key event for the sun

 primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {

 switch (event.getCode()) {

 case W:

 sun.translateZProperty().set(sun.getTranslateZ() + 100);
 sun.translateZProperty().set(sun.getTranslateZ() + 100);

 break;

case S:

sun.translateZProperty().set(sun.getTranslateZ() - 100);
break;

case Y:
sun.translateZProperty().set(sun.getTranslateY() - 100);


case D:
    sun.translateYProperty().set(sun.getTranslateY() + 100);

 }

 });
 

 //mouse event for the earth( هذي المفروض نطبق فيها فقره سي)

primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {



if (event.getButton() == MouseButton.PRIMARY) {
earth.setRotationAxis(Rotate.X_AXIS);
} else if (event.getButton() == MouseButton.SECONDARY) {
earth.setRotationAxis(Rotate.Y_AXIS);
earth.translateYProperty().set(earth.getTranslateY() + 100);
} else {
earth.setRotationAxis(Rotate.Z_AXIS);
}
earth.setRotate(earth.getRotate() +10);


});


        /////////////////////////////////////////



 //spin




//////////////////////////////////////important////////////





Scene scene = new Scene(group, w, h);
PerspectiveCamera c = new PerspectiveCamera();
scene.setCamera(c);
scene.setFill(Color.WHITE);



primaryStage.setTitle("planets");
primaryStage.setScene(scene);
primaryStage.show();



 //key event for the scene( every thing return the same in the scene)

 primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {

 switch (event.getCode()) {

 case R:
earth.setTranslateX(-1* w / 3 + 200.0);
earth.setTranslateY(w /664);
earth.setTranslateZ(50);

sun.setTranslateX( -13* w / 28 + 100.0);
sun.setTranslateY(w / 100);
sun.setTranslateZ(10);






 break;

 }

 });


        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
