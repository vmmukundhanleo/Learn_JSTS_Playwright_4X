let score = 90;
switch (true) {
    case score >= 100 || score <=0:
    console.log("Invalid Score ")
    break;
    case score >= 95:
    console.log("A+");
    break;
    case score >= 85:
    console.log("A");
    break;
    case score >=75:
    console.log("B");
    break;
    case score >= 65:
    console.log("C");
    break;
    case score >= 55:
    console.log("D");
    break;
    default:
    console.log("F");
}
