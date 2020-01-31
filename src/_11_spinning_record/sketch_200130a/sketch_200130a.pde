import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int angle = 0;
boolean click = false;
void setup() {
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
  size(600, 600);
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(600, 600);
}
void draw() {
  if (mousePressed) {
    song.play();
  }
  if (!mousePressed) {
    song.pause();
  }
  rotateImage(pictureOfRecord, angle);
  print(click + " " + mousePressed + "     ");
  if (mousePressed) {
    angle++;
  }
  image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
