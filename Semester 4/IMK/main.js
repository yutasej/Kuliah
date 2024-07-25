var slidering = document.querySelector(".slider-img");
var slidering2 = document.querySelector(".slider-img-2");
var slidering3 = document.querySelector(".slider-img-3");
var slidering4 = document.querySelector(".slider-img-4");
var imageOne = ["image1.webp", "image4.webp"];
var imageTwo = ["image5.webp", "image2.webp"];
var imageThree = ["image6.webp", "image3.webp"];
var imageFour = ["image7.webp", "image8.webp"];
var i = 0;

function prev() {
  if (i <= 0) {
    i = imageOne.length;
  }
  i--;
  return setImg();
}

function prevTwo() {
  if (i <= 0) {
    i = imageTwo.length;
  }
  i--;
  return setImgTwo();
}

function prevThree() {
  if (i <= 0) {
    i = imageThree.length;
  }
  i--;
  return setImgThree();
}

function prevFour() {
  if (i <= 0) {
    i = imageFour.length;
  }
  i--;
  return setImgFour();
}

function next() {
  if (i >= imageOne.length - 1) {
    i = -1;
  }
  i++;
  return setImg();
}

function nextTwo() {
  if (i >= imageTwo.length - 1) {
    i = -1;
  }
  i++;
  return setImgTwo();
}

function nextThree() {
  if (i >= imageThree.length - 1) {
    i = -1;
  }
  i++;
  return setImgThree();
}

function nextFour() {
  if (i >= imageFour.length - 1) {
    i = -1;
  }
  i++;
  return setImgFour();
}

function setImg() {
  return slidering.setAttribute("src", "images/" + imageOne[i]);
}

function setImgTwo() {
  return slidering2.setAttribute("src", "images/" + imageTwo[i]);
}

function setImgThree() {
  return slidering3.setAttribute("src", "images/" + imageThree[i]);
}

function setImgFour() {
  return slidering4.setAttribute("src", "images/" + imageFour[i]);
}
