<html lang="en">

<head>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
    <h2>Hello visitor!</h2>

    <form method="post" action="/postEmail">

        <h1>Fill out Email Contents</h1>

        <label>Sender Email</label>
        <input type="text" name="sender" placeholder="jane@revature.net" required value="">

        <label>Receiver Email</label>
        <input type="text" name="receiver" placeholder="john@revature.net" required value="">

        <label>Subject</label>
        <input type="text" name="subject" placeholder="Email Subject" required value="">

        <label>Contents</label>
        <input type="text" name="contents" placeholder="Email Contents" required value="">

        <input type="submit" value="Add">
    </form>

</body>
</html>