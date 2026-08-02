function loadProducts() {

fetch("products")

.then(response =>
response.text())

.then(data => {

document
.getElementById("result")
.innerHTML = data;

});
}