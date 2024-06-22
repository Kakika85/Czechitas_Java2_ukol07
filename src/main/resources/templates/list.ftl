[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Můj blog</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h1>Můj blog</h1>
[#list posts as post]
    <div>
        <h2>${post.title}</h2>
        <p>${post.perex?no_esc}</p>
        <p><a href="/post/${post.slug}">Přečíst</a></p>
        <p>${post.published} | ${post.author}</p>
    </div>
[/#list]
<div>
    [#if posts.hasPrevious()]
        <a href="/?page=${posts.number - 1}">Předchozí</a>
    [/#if]
    [#if posts.hasNext()]
        <a href="/?page=${posts.number + 1}">Další</a>
    [/#if]
</div>
</body>
</html>
