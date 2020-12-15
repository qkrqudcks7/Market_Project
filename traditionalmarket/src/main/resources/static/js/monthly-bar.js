// 최대값 그래프

const ctxMax = document.getElementById('barChartMax');
const ctxMin = document.getElementById('barChartMin');

const janX = document.getElementsByClassName('janX')[0].getAttribute('value');
const febX = document.getElementsByClassName('febX')[0].getAttribute('value');
const marX = document.getElementsByClassName('marX')[0].getAttribute('value');
const aprX = document.getElementsByClassName('aprX')[0].getAttribute('value');
const mayX = document.getElementsByClassName('mayX')[0].getAttribute('value');
const junX = document.getElementsByClassName('junX')[0].getAttribute('value');
const julX = document.getElementsByClassName('julX')[0].getAttribute('value');
const augX = document.getElementsByClassName('augX')[0].getAttribute('value');
const sepX = document.getElementsByClassName('sepX')[0].getAttribute('value');
const octX = document.getElementsByClassName('octX')[0].getAttribute('value');
const novX = document.getElementsByClassName('novX')[0].getAttribute('value');

const janM = document.getElementsByClassName('janM')[0].getAttribute('value');
const febM = document.getElementsByClassName('febM')[0].getAttribute('value');
const marM = document.getElementsByClassName('marM')[0].getAttribute('value');
const aprM = document.getElementsByClassName('aprM')[0].getAttribute('value');
const mayM = document.getElementsByClassName('mayM')[0].getAttribute('value');
const junM = document.getElementsByClassName('junM')[0].getAttribute('value');
const julM = document.getElementsByClassName('julM')[0].getAttribute('value');
const augM = document.getElementsByClassName('augM')[0].getAttribute('value');
const sepM = document.getElementsByClassName('sepM')[0].getAttribute('value');
const octM = document.getElementsByClassName('octM')[0].getAttribute('value');
const novM = document.getElementsByClassName('novM')[0].getAttribute('value');

const red = 'rgba(255, 99, 132, 0.4)'
const blue = 'rgba(54, 162, 235, 1)'

const myChartMax = new Chart(ctxMax, {
    type: 'bar',
    data: {
        labels: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월'],
        datasets: [{
            label: '최대값',
            data: [janX, febX, marX, aprX, mayX, junX, julX, augX, sepX, octX, novX],
            backgroundColor: [red, red, red, red, red, red, red, red, red, red, red
            ],
            borderColor: [red, red, red, red, red, red, red, red, red, red, red
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }],
            yAxes: [{
                ticks: {
                    fontSize: 13
                }
            }]
        }
    }
});

// 최소값 그래프


const myChartMin = new Chart(ctxMin, {
    type: 'bar',
    data: {
        labels: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월'],
        datasets: [{
            label: '최소값',
            data: [janM, febM, marM, aprM, mayM, junM, julM, augM, sepM, octM, novM],
            backgroundColor: [
                blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue
            ],
            borderColor: [blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }],
            yAxes: [{
                ticks: {
                    fontSize: 13
                }
            }]
        }
    }
});