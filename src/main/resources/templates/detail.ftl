<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>${post.title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h1>${post.title}</h1>
<p>${post.perex?no_esc}</p>
<p>${post.body?no_esc}</p>
<p>${post.published} | ${post.author}</p>
<p><a href="/">Zpět na hlavní stránku</a></p>
</body>
</html>
