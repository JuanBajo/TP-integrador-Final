function ocultarTotal() {
    divTotal.style.display = "none";

}

function calcularTotal() {
    const categoria = document.getElementById("categoria").value;
    const cantidad = document.getElementById("cantidad").value;
    const divTotal = document.getElementById("divTotal");
    let descuento;

    switch (categoria) {
        case "1":
            descuento = 0.8;

            break;
        case "2":
            descuento = 0.5;
            break;
        case "3":
            descuento = 0.15;
            break;
        default:
            descuento = 1;

    }
    let total = (cantidad * 200) - (cantidad * 200 * descuento)
    divTotal.textContent = `Total a pagar: $${total}`
    divTotal.style.display = "block";
}