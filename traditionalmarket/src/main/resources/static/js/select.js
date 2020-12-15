const prt1 = document.querySelector(".prH1");
const prt2 = document.querySelector(".prL1");
const prt3 = document.querySelector(".qlH1");
const prt4 = document.querySelector(".qlL1");
const prt5 = document.querySelector(".w1");
const prt6 = document.querySelector(".r1");

const prt7 = document.querySelector("#sbt");


function noSubmit(chk) {
    if (prt1.checked == false && prt2.checked == false && prt3.checked == false && prt4.checked == false && prt5.checked == false && prt6.checked == false) {
        if (prt7 == chk) {
            alert("항목을 먼저 선택해주세요!")
            return false;
        }
    }
};