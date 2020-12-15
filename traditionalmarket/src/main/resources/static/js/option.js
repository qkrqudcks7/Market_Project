const prH_1 = document.querySelector(".prH1");
const prL_1 = document.querySelector(".prL1");
const qlH_1 = document.querySelector(".qlH1");
const qlL_1 = document.querySelector(".qlL1");
const w_1 = document.querySelector(".w1");
const r_1 = document.querySelector(".r1");

function PriceCheck(chk) {

    if (prH_1 == chk) {
        prL_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (prL_1 == chk) {
        prH_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    }
};

function QualCheck(chk) {

    if (qlH_1 == chk) {
        qlL_1.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    } else if (qlL_1 == chk) {
        qlH_1.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        w_1.checked = false;
        r_1.checked = false;
    }
};

function QuanCheck(chk) {

    if (w_1 == chk) {
        r_1.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
    } else if (r_1 == chk) {
        w_1.checked = false;
        prH_1.checked = false;
        prL_1.checked = false;
        qlH_1.checked = false;
        qlL_1.checked = false;
    }
};
