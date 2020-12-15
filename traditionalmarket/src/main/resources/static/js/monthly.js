const ctx = document.getElementById('myChartAvg').getContext('2d');

const jan = document.getElementsByClassName('jan')[0].getAttribute('value');
const feb = document.getElementsByClassName('feb')[0].getAttribute('value');
const mar = document.getElementsByClassName('mar')[0].getAttribute('value');
const apr = document.getElementsByClassName('apr')[0].getAttribute('value');
const may = document.getElementsByClassName('may')[0].getAttribute('value');
const jun = document.getElementsByClassName('jun')[0].getAttribute('value');
const jul = document.getElementsByClassName('jul')[0].getAttribute('value');
const aug = document.getElementsByClassName('aug')[0].getAttribute('value');
const sep = document.getElementsByClassName('sep')[0].getAttribute('value');
const oct = document.getElementsByClassName('oct')[0].getAttribute('value');
const nov = document.getElementsByClassName('nov')[0].getAttribute('value');

const chartAvg = new Chart(ctx, {

    type: 'line',

    data: {

        // X축 월별
        labels: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월'],

        datasets: [{
            label: '가격 변동 수치',
            backgroundColor: 'transparent',
            borderColor: '#0482c6',

            // 각 월별 수치
            // 세로축은 값에 따라서 자동으로 지정됨
            data: [jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov]
        }]
    },

    options: {
        legend: {
            display: false
        },

        title: {
            display: true,
            // 제목
            text: '월별 가격 변동 현황',
            fontSize: 20,
            fontColor: '#3a3c4e'
        }
    }
}
);
