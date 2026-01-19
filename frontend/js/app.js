async function testAPI() {
    const resultEl = document.getElementById('result');
    resultEl.textContent = 'Loading...';

    try {
        const response = await fetch('/users');
        const data = await response.json();
        resultEl.textContent = JSON.stringify(data, null, 2);
    } catch (error) {
        resultEl.textContent = `Error: ${error.message}`;
    }
}

// 페이지 로드 시 실행
document.addEventListener('DOMContentLoaded', () => {
    console.log('Frontend loaded successfully!');
});
