
/**
 * Write a description of class tardis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mountain_hut
{
    private Square sky;
    private Triangle mountain1;
    private Triangle mountain2;
    private Triangle snow1;
    private Triangle snow2;
    private Circle moon;
    private Square cloudS;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Square wall;
    private Triangle roof;
    private Square door1;
    private Square door2;
    private Square window;
    private Square chimney1;
    private Square chimney2;

    public mountain_hut()
    {
        sky = new Square();
        drawSky();
        mountain1 = new Triangle();
        drawMountain1();
        snow1 = new Triangle();
        drawSnow1();
        mountain2 = new Triangle();
        drawMountain2();
        snow2 = new Triangle();
        drawSnow2();
        moon = new Circle();
        drawMoon();
        cloudS = new Square();
        drawCloudS();
        cloud1 = new Circle();
        drawCloud1();
        cloud2 = new Circle();
        drawCloud2();
        cloud3 = new Circle();
        drawCloud3();
        wall = new Square();
        drawWall();
        roof = new Triangle();
        drawRoof();
        door1 = new Square();
        drawDoor1();
        door2 = new Square();
        drawDoor2();
        window = new Square();
        drawWindow();
        chimney1 = new Square();
        drawChimney1();
        chimney2 = new Square();
        drawChimney2();
    }

    public void drawSky()
    {
        sky.makeVisible();
        sky.changeColor("skyGrey");
        sky.changeSize(300);
    }

    public void drawMountain1()
    {
        mountain1.makeVisible();
        mountain1.changeSize(200,300);
        mountain1.moveHorizontal(150);
        mountain1.moveVertical(100);
        mountain1.changeColor("darkGrey");
    }

    public void drawSnow1()
    {
        snow1.makeVisible();
        snow1.moveHorizontal(150);
        snow1.moveVertical(100);
        snow1.changeSize(40,60);
        snow1.changeColor("white");
    }

    public void drawMountain2()
    {
        mountain2.makeVisible();
        mountain2.changeSize(150,300);
        mountain2.moveHorizontal(60);
        mountain2.moveVertical(150);
        mountain2.changeColor("darkGrey");
    }

    public void drawSnow2()
    {
        snow2.makeVisible();
        snow2.moveHorizontal(60);
        snow2.moveVertical(150);
        snow2.changeSize(25,50);
        snow2.changeColor("white");
    }

    public void drawMoon()
    {
        moon.makeVisible();
        moon.changeSize(50);
        moon.moveVertical(35);
        moon.moveHorizontal(50);
        moon.changeColor("moonGlow");
    }

    public void drawCloudS()
    {
        cloudS.makeVisible();
        cloudS.moveHorizontal(50);
        cloudS.moveVertical(60);
        cloudS.changeColor("cloudGrey");
    }

    public void drawCloud1()
    {
        cloud1.makeVisible();
        cloud1.changeSize(31);
        cloud1.moveHorizontal(30);
        cloud1.moveVertical(59);
        cloud1.changeColor("cloudGrey");
    }
    
    public void drawCloud2()
    {
        cloud2.makeVisible();
        cloud2.changeSize(31);
        cloud2.moveHorizontal(45);
        cloud2.moveVertical(45);
        cloud2.changeColor("cloudGrey");
    }
    
    public void drawCloud3()
    {
        cloud3.makeVisible();
        cloud3.changeSize(31);
        cloud3.moveHorizontal(60);
        cloud3.moveVertical(59);
        cloud3.changeColor("cloudGrey");
    }

    public void drawWall()
    {
        wall.makeVisible();
        wall.moveVertical(200);
        wall.moveHorizontal(130);
        wall.changeSize(50);
        wall.changeColor("brown");
    }

    public void drawRoof()
    {
        roof.makeVisible();
        roof.moveVertical(167);
        roof.moveHorizontal(135);
        roof.changeSize(40,60);
        roof.changeColor("black");
    }

    public void drawDoor1()
    {
        door1.makeVisible();
        door1.moveVertical(230);
        door1.moveHorizontal(139);
        door1.changeSize(13);
        door1.changeColor("darkBrown");
    }

    public void drawDoor2()
    {
        door2.makeVisible();
        door2.moveVertical(237);
        door2.moveHorizontal(139);
        door2.changeSize(13);
        door2.changeColor("darkBrown");
    }

    public void drawWindow()
    {
        window.makeVisible();
        window.moveVertical(230);
        window.moveHorizontal(160);
        window.changeSize(13);
        window.changeColor("lightBlue");
    }

    public void drawChimney1()
    {
        chimney1.makeVisible();
        chimney1.changeSize(8);
        chimney1.moveVertical(186);
        chimney1.moveHorizontal(168);
        chimney1.changeColor("black");
    }

    public void drawChimney2()
    {
        chimney2.makeVisible();
        chimney2.changeSize(8);
        chimney2.moveVertical(178);
        chimney2.moveHorizontal(168);
        chimney2.changeColor("black");
    }

}
