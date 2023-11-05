<link rel="stylesheet" href="styles.css">
<div class="group5">
    <canvas id="myChart"></canvas>
</div>

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<script>
    const ctx = document.getElementById('myChart');

    new Chart(ctx, {
        type: 'pie',
        data: {
            labels: ['Completion ', 'InProgress'],
            datasets: [{
                label: 'Dataset 1',
                data: [1, 2, 3],
                borderColor: '#01090c',
                backgroundColor: '#c1ccd5',
            },]
        },

    });
</script>
