const categories = ['historical-places', 'cultural-events', 'museums-exhibitions', 'traditional-cuisine', 'festivals-celebrations'];

categories.forEach(category => {
    document.getElementById(category).addEventListener('click', function() {
        window.location.href = `${category}`;
    });
});
