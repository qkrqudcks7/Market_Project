const container = document.getElementById('map');

const nambu = {
    center: new kakao.maps.LatLng(35.81277080070899, 127.1469777102885),
    level: 3
};

const garak = {
    center: new kakao.maps.LatLng(37.49304415616005, 127.11483621171726),
    level: 3
};

const gakwha = {
    center: new kakao.maps.LatLng(35.184517591797515, 126.93437142866725),
    level: 3
};

const gyeongdong = {
    center: new kakao.maps.LatLng(37.57952294340211, 127.03879825506773),
    level: 3
};

const gongdong = {
    center: new kakao.maps.LatLng(35.08877788154814, 129.02532071351365),
    level: 3
};

const nampo = {
    center: new kakao.maps.LatLng(35.09792369694969, 129.03492562700734),
    level: 3
};

const donggu = {
    center: new kakao.maps.LatLng(35.87462915850652, 128.63989612702386),
    level: 3
};

const dongmun = {
    center: new kakao.maps.LatLng(33.51181436154385, 126.52608826930329),
    level: 3
};

const bujeon = {
    center: new kakao.maps.LatLng(35.16279299841173, 129.06147379817313),
    level: 3
};

const bokjori = {
    center: new kakao.maps.LatLng(37.53926169251964, 127.14382972308651),
    level: 3
};

const bukbu = {
    center: new kakao.maps.LatLng(35.90324917493636, 128.54324163654422),
    level: 3
};

const sangnam = {
    center: new kakao.maps.LatLng(35.224164856272516, 128.6831091340513),
    level: 3
};

const seomun = {
    center: new kakao.maps.LatLng(35.86904964702354, 128.58074498284608),
    level: 3
};

const sinjeong = {
    center: new kakao.maps.LatLng(35.542537435819284, 129.31006983524045),
    level: 3
};

const yanggok = {
    center: new kakao.maps.LatLng(37.45897021349935, 127.03667752244806),
    level: 3
};

const yangdong = {
    center: new kakao.maps.LatLng(35.154589366175124, 126.90135118467954),
    level: 3
};

const umgung = {
    center: new kakao.maps.LatLng(35.128404672317046, 128.96426390769216),
    level: 3
};

const daejeon_yeokjeon = {
    center: new kakao.maps.LatLng(36.330524959040176, 127.4341226037443),
    level: 3
};

const suncheon_yeokjeon = {
    center: new kakao.maps.LatLng(34.748145437471734, 127.743920784671),
    level: 3
};

const yeongdungpo = {
    center: new kakao.maps.LatLng(37.52028595609094, 126.90563628048119),
    level: 3
};

const ojeong = {
    center: new kakao.maps.LatLng(36.35922974275708, 127.40695711169226),
    level: 3
};

const yukgeori = {
    center: new kakao.maps.LatLng(36.62917498864856, 127.48840588794171),
    level: 3
};

const indong = {
    center: new kakao.maps.LatLng(36.32190007498324, 127.43694439819795),
    level: 3
};

const jukdo = {
    center: new kakao.maps.LatLng(36.03628508685865, 129.36849628146783),
    level: 3
};

const seoul_jungbu = {
    center: new kakao.maps.LatLng(37.56519635573768, 127.00180832068591),
    level: 3
};

const daejeon_jungbu = {
    center: new kakao.maps.LatLng(36.33148434805461, 127.42931715258923),
    level: 3
};

const gangneung_jungang = {
    center: new kakao.maps.LatLng(37.754661914646285, 128.8985233846579),
    level: 3
};

const daejeon_jungang = {
    center: new kakao.maps.LatLng(36.32959492169177, 127.43193405402052),
    level: 3
};

const chuncheon_jungang = {
    center: new kakao.maps.LatLng(37.87822438604785, 127.7257019712456),
    level: 3
};

const jidong = {
    center: new kakao.maps.LatLng(37.277859696299686, 127.01922123370598),
    level: 3
};

const chilsung = {
    center: new kakao.maps.LatLng(35.87685433395873, 128.60454622517508),
    level: 3
};

const hyundai = {
    center: new kakao.maps.LatLng(37.47697476847654, 126.64498509822336),
    level: 3
};


var market = document.getElementById('map').getAttribute('value');
var country = document.getElementById('country').getAttribute('value');

var mapName = null;
var ctrName = null;

function marketLocation(name, city) {

    switch (name) {
        case ("가락도매"):
            mapName = garak;
            break;
        case ("각화도매"):
            mapName = gakwha;
            break;
        case ("경동"):
            mapName = gyeongdong;
            break;
        case ("공동어"):
            mapName = gongdong;
            break;
        case ("남부"):
            mapName = nambu;
            break;
        case ("남포동건어물"):
            mapName = nampo;
            break;
        case ("동구"):
            mapName = donggu;
            break;
        case ("동문"):
            mapName = dongmun;
            break;
        case ("복조리"):
            mapName = bokjori;
            break;
        case ("부전"):
            mapName = bujeon;
            break;
        case ("북부도매"):
            mapName = bukbu;
            break;
        case ("상남"):
            mapName = sangnam;
            break;
        case ("서문"):
            mapName = seomun;
            break;
        case ("신정"):
            mapName = sinjeong;
            break;
        case ("양곡도매"):
            mapName = yanggok;
            break;
        case ("양동"):
            mapName = yangdong;
            break;
        case ("엄궁도매"):
            mapName = umgung;
            break;
        case ("영등포"):
            mapName = yeongdungpo;
            break;
        case ("오정도매"):
            mapName = ojeong;
            break;
        case ("육거리"):
            mapName = yukgeori;
            break;
        case ("인동"):
            mapName = indong;
            break;
        case ("죽도"):
            mapName = jukdo;
            break;
        case ("지동"):
            mapName = jidong;
            break;
        case ("칠성"):
            mapName = chilsung;
            break;
        case ("현대"):
            mapName = hyundai;
            break;
    }

    if (name == "역전" && city == "대전") {
        mapName = daejeon_yeokjeon;
    } else if (name == "역전" && city == "순천") {
        mapName = suncheon_yeokjeon;
    }

    else if (name == "중부" && city == "서울") {
        mapName = seoul_jungbu;
    } else if (name == "중부" && city == "대전") {
        mapName = daejeon_jungbu;
    }

    else if (name == "중앙" && city == "강릉") {
        mapName = gangneung_jungang;
    } else if (name == "중앙" && city == "대전") {
        mapName = daejeon_jungang;
    } else if (name == "중앙" && city == "춘천") {
        mapName = chuncheon_jungang;
    }
}

marketLocation(market, country);

// 맨 오른쪽 변수 이름 수정하여 지도 변경 가능
const map = new kakao.maps.Map(container, mapName);

// 일반 지도와 스카이뷰로 지도 타입을 전환할 수 있는 지도타입 컨트롤 생성
var mapTypeControl = new kakao.maps.MapTypeControl();

map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);

// 지도 확대 축소를 제어할 수 있는 컨트롤 생성
var zoomControl = new kakao.maps.ZoomControl();
map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);

// 마커 표시 위치
var markerPosition = mapName.center;

// 마커 생성
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커 지도 위에 표시
marker.setMap(map);



