<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Naga N.Pranav's Pirate Code Cove</title>
    <style>
        body {
            background-color: #1a1a1a;
            color: #fff;
            font-family: 'Courier New', monospace;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            overflow: hidden;
        }

        .container {
            background: rgba(255, 255, 255, 0.05);
            border-radius: 16px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
            backdrop-filter: blur(5px);
            -webkit-backdrop-filter: blur(5px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            width: 80%;
            max-width: 800px;
            padding: 20px;
            text-align: center;
        }

        h1 {
            font-size: 2.5em;
            margin-bottom: 20px;
            background: linear-gradient(45deg, #ff00cc, #3333ff);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }

        .section {
            margin: 20px 0;
            padding: 10px;
            background: rgba(255, 255, 255, 0.1);
            border-radius: 8px;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            margin: 10px 0;
        }

        a {
            color: #00bfff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            transition: background-color 0.3s, box-shadow 0.3s;
        }

        .button:hover {
            background-color: #45a049;
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }

        .toggle-mode {
            position: fixed;
            bottom: 20px;
            right: 20px;
            background: transparent;
            border: none;
            color: #fff;
            cursor: pointer;
            font-size: 1em;
        }
    </style>
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
