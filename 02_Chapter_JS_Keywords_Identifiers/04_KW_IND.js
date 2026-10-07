// var vs let vs const
// which one we are going to use?

// From QA point of view:
// let - 96%
// const - 3%
// var - 1%

var v = 10;
var v = 20; // var can be redeclared

let m = 6;
m = 100; // let can be reassigned, but not redeclared in the same scope

const c = 1000; // const cannot be reassigned or redeclared in the same scope

console.log(v);
console.log(m);
console.log(c);
