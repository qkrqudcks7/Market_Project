const form = document.querySelector('#srch-form');
form.onsubmit = function () {
    const srch = document.querySelector('#srch').value;

    if (!srch.trim()) {
        alert("검색어를 입력해주세요!");
        return false;
    }
}