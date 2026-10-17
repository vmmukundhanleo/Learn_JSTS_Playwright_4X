let responseCode = 404;
switch (responseCode) {
    case 200:
    console.log("OK - The request has succeeded");
    break;
    case 201:
    console.log("Created - The request has been fulfilled and resulted in a new resource being created");
    break;
    case 404:
    console.log("Not Found - The server has not found anything matching the Request-URI");
    break;
    default:
    console.log("Invalid response code");
}
