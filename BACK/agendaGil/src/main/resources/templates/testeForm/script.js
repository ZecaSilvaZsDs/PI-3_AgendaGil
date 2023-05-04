let i = 0, cicle = 30, control = 0;
var time;
let stoped, songBg; 
let song = document.querySelector(".audioRodar");
const lit = "0 0 20px #0f0";
const out = "7px 7px 8px #444";
let contex  =  new AudioContext();
oscillator = contex.createOscillator();

const nameDrown = document.querySelector(".P-drawn");
const boxNameDrawn = document.querySelector(".box-name-drawn");

const buttom = document.querySelector(".buttom");

function clickButtom() {
    if(control == 0) {
        songBg = document.querySelector(".audioParou");
        songBg.play();
        stoped = Math.floor(Math.random() * 6 + 300);
        cicle = 0;
        console.log(stoped);
        interaction()
        nameDrown.innerHTML = "";
        boxNameDrawn.style.background = "#c8dbfe";

    }
};

buttom.addEventListener('click', clickButtom);

function interaction() {
    time = setTimeout(interaction, cicle);
    if(i == 6) {
        i = 0;
    };
    i++;
    paint(i);
    stoped--;
    if (stoped < 60){
        cicle += 10;
    }
    
    if(stoped == 0) {
        clearTimeout(time);
        control = 0;
        songBg.pause();
        song.play();
        nameDrown.innerHTML = document.querySelector("#n"+i).innerHTML;
        boxNameDrawn.style.background = "#79FCD0";
    }
};


function paint(color) {
    if(color <= 6) {
        document.querySelector("#n"+color).style.boxShadow = lit;
    };
    if(color > 1) {
        color--;
        document.querySelector("#n"+color).style.boxShadow = out;

    }else if(i == 1) { 
        document.querySelector("#n6").style.boxShadow = out;
    }
};

function down() {
    buttom.style.boxShadow = "none";
}
buttom.addEventListener('mousedown', down)

function up() {
    buttom.style.boxShadow = "5px 5px 8px #444";
}
buttom.addEventListener('mouseup', up)