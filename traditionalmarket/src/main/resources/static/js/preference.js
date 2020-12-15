const prH_1 = document.querySelector(".prH1");
const prL_1 = document.querySelector(".prL1");
const qlH_1 = document.querySelector(".qlH1");
const qlL_1 = document.querySelector(".qlL1");
const w_1 = document.querySelector(".w1");
const r_1 = document.querySelector(".r1");

const prH_2 = document.querySelector(".prH2");
const prL_2 = document.querySelector(".prL2");
const qlH_2 = document.querySelector(".qlH2");
const qlL_2 = document.querySelector(".qlL2");
const w_2 = document.querySelector(".w2");
const r_2 = document.querySelector(".r2");

const prH_3 = document.querySelector(".prH3");
const prL_3 = document.querySelector(".prL3");
const qlH_3 = document.querySelector(".qlH3");
const qlL_3 = document.querySelector(".qlL3");
const w_3 = document.querySelector(".w3");
const r_3 = document.querySelector(".r3");


function PriceCheck(chk) {

    if (prH_1 == chk) {
        prL_1.checked = false;
        prH_2.checked = false;
        prH_3.checked = false;
        prL_2.checked = false;
        prL_3.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (prL_1 == chk) {
        prH_1.checked = false;
        prH_2.checked = false;
        prH_3.checked = false;
        prL_2.checked = false;
        prL_3.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (prH_2 == chk) {
        prL_2.checked = false;
        prH_1.checked = false;
        prH_3.checked = false;
        prL_1.checked = false;
        prL_3.checked = false;
        qlH_2.checked = false;
        qlL_2.checked = false;
        w_2.checked = false;
        r_2.checked = false;
    } else if (prL_2 == chk) {
        prH_2.checked = false;
        prH_1.checked = false;
        prH_3.checked = false;
        prL_1.checked = false;
        prL_3.checked = false;
        qlH_2.checked = false;
        qlL_2.checked = false;
        w_2.checked = false;
        r_2.checked = false;
    } else if (prH_3 == chk) {
        prL_3.checked = false;
        prH_1.checked = false;
        prH_2.checked = false;
        prL_1.checked = false;
        prL_2.checked = false;
        qlH_3.checked = false;
        qlL_3.checked = false;
        w_3.checked = false;
        r_3.checked = false;
    } else if (prL_3 == chk) {
        prH_3.checked = false;
        prH_1.checked = false;
        prH_2.checked = false;
        prL_1.checked = false;
        prL_2.checked = false;
        qlH_3.checked = false;
        qlL_3.checked = false;
        w_3.checked = false;
        r_3.checked = false;
    }
}

function QualCheck(chk) {

    if (qlH_1 == chk) {
        qlL_1.checked = false;
        qlH_2.checked = false;
        qlH_3.checked = false;
        qlL_2.checked = false;
        qlL_3.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (qlL_1 == chk) {
        qlH_1.checked = false;
        qlH_2.checked = false;
        qlH_3.checked = false;
        qlL_2.checked = false;
        qlL_3.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (qlH_2 == chk) {
        qlL_2.checked = false;
        qlH_1.checked = false;
        qlH_3.checked = false;
        qlL_1.checked = false;
        qlL_3.checked = false;
        prH_2.checked = false;
        prL_2.checked = false;
        w_2.checked = false;
        r_2.checked = false;
    } else if (qlL_2 == chk) {
        qlH_2.checked = false;
        qlH_1.checked = false;
        qlH_3.checked = false;
        qlL_1.checked = false;
        qlL_3.checked = false;
        prH_2.checked = false;
        prL_2.checked = false;
        w_2.checked = false;
        r_2.checked = false;
    } else if (qlH_3 == chk) {
        qlL_3.checked = false;
        qlH_1.checked = false;
        qlH_2.checked = false;
        qlL_1.checked = false;
        qlL_2.checked = false;
        prH_3.checked = false;
        prL_3.checked = false;
        w_3.checked = false;
        r_3.checked = false;
    } else if (qlL_3 == chk) {
        qlH_3.checked = false;
        qlH_1.checked = false;
        qlH_2.checked = false;
        qlL_1.checked = false;
        qlL_2.checked = false;
        prH_3.checked = false;
        prL_3.checked = false;
        w_3.checked = false;
        r_3.checked = false;
    }
}

function QuanCheck(chk) {

    if (w_1 == chk) {
        r_1.checked = false;
        w_2.checked = false;
        w_3.checked = false;
        r_2.checked = false;
        r_3.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
    } else if (r_1 == chk) {
        w_1.checked = false;
        w_2.checked = false;
        w_3.checked = false;
        r_2.checked = false;
        r_3.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
    } else if (w_2 == chk) {
        r_2.checked = false;
        w_1.checked = false;
        w_3.checked = false;
        r_1.checked = false;
        r_3.checked = false;
        prH_2.checked = false;
        prL_2.checked = false;
        qlH_2.checked = false;
        qlL_2.checked = false;
    } else if (r_2 == chk) {
        w_2.checked = false;
        w_1.checked = false;
        w_3.checked = false;
        r_1.checked = false;
        r_3.checked = false;
        prH_2.checked = false;
        prL_2.checked = false;
        qlH_2.checked = false;
        qlL_2.checked = false;
    } else if (w_3 == chk) {
        r_3.checked = false;
        w_1.checked = false;
        w_2.checked = false;
        r_1.checked = false;
        r_2.checked = false;
        prH_3.checked = false;
        prL_3.checked = false;
        qlH_3.checked = false;
        qlL_3.checked = false;
    } else if (r_3 == chk) {
        w_3.checked = false;
        w_1.checked = false;
        w_2.checked = false;
        r_1.checked = false;
        r_2.checked = false;
        prH_3.checked = false;
        prL_3.checked = false;
        qlH_3.checked = false;
        qlL_3.checked = false;
    }
}
