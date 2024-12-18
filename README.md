<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <div class="container">
        <h1>Naga N.Pranav's Pirate Code Cove</h1>

        <div class="section">
            <h2>About Me</h2>
            <ul>
                <li><strong>Occupation:</strong> Code Alchemist</li>
                <li><strong>Hobbies:</strong> Merging with machines, ice cream with wooden spoons, debating light vs. dark mode</li>
            </ul>
        </div>

        <div class="section">
            <h2>My Coding Philosophy</h2>
            <ul>
                <li><strong>Languages:</strong> Vim, HTMX, Linux</li>
                <li><strong>Tools:</strong> GitHub, Vim, Terminal</li>
            </ul>
        </div>

        <div class="section">
            <h2>Projects</h2>
            <ul>
                <li><strong>Project Name 1:</strong> Runs Linux on everything</li>
                <li><strong>Project Name 2:</strong> Light/Dark mode based on existential crisis</li>
                <li><strong>Project Name 3:</strong> Startup simulator</li>
            </ul>
        </div>

        <div class="section">
            <h2>Let's Connect</h2>
            <a href="https://x.com/NagaPranavN" class="button">X (Twitter)</a>
            <a href="mailto:your-email@example.com" class="button">Email</a>
        </div>
    </div>

    <button class="toggle-mode" id="toggleMode">Toggle Mode</button>

    <script>
        const body = document.body;
        const toggleModeButton = document.getElementById('toggleMode');

        function toggleLightDarkMode() {
            if (body.style.backgroundColor === 'white') {
                body.style.backgroundColor = '#1a1a1a';
                body.style.color = 'white';
            } else {
                body.style.backgroundColor = 'white';
                body.style.color = 'black';
            }
        }

        toggleModeButton.addEventListener('click', toggleLightDarkMode);
    </script>
</body>
</html>
