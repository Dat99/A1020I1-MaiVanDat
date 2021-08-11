<!doctype html>
<html lang="en">
<head>
    <title>Ứng dụng chuyển đổi tiền tệ</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="static/css/bootstrap.css">

</head>
<body>
<div>
    <h1>Currency Converter</h1>
    <form method="post" action="converter/converter.jsp">
        <label>Rate: </label>
        <br/>
        <input type="text" name="rate" placeholder="RATE" value="22000"/>
        <br/>
        <label>USD: </label>
        <br/>
        <input type="text" name="usd" placeholder="USD" value="0"/>
        <br/>
        <input type = "submit"  value ="Converter"/>
    </form>
</div>

<script src="static/js/jquery-3.6.0.min.js"></script>
<script src="static/js/popper.js"></script>
<script src="static/js/bootstrap.js"></script>
</body>
</html>