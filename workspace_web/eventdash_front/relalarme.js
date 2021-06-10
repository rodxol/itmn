function gerarAlarme() {
    
    fetch("http://localhost:8080/alarmes").then(res => res.json())
    .then(lista => preencheRelatorio(lista));
}

function preencheRelatorio(lista){
    
    var strTabela = `<table class="table table-hover">
                        <thead>
                            <tr>
                                <th class="col">#</th>
                                <th class="col">Nome do Alarme</th>
                                <th class="col">Descrição</th>
                            </tr>
                        </thead>
                        <tbody>`;
    for (i = 0; i < lista.length; i++) {
        var alarme = lista[i];
        strTabela = strTabela + `<tr>
                                        <td class="col">${alarme.id}</td>
                                        <td class="col">${alarme.nome}</td>
                                        <td class="col">${alarme.descricao}</td>
                                </tr>`;
    }
    // fechar a tabela
    strTabela = strTabela + `</tbody>
    </table>`;

    document.getElementById("tabela").innerHTML = strTabela;                             

}

function gerarEquipamento() {

    fetch("http://localhost:8080/equipamentos").then(res => res.json())
    .then(lista => preencheRelEquip(lista));
}

function preencheRelEquip(lista){
    var strTabela = `<table class="table table-hover">
    <thead>
        <tr>
            <th class="col">#</th>
            <th class="col">Nome do Alarme</th>
            <th class="col">Descrição</th>
        </tr>
    </thead>
    <tbody>`;
    for (i = 0; i < lista.length; i++) {
    var equipamento = lista[i];
    strTabela = strTabela + `<tr>
                    <td class="col">${equipamento.id}</td>
                    <td class="col">${equipamento.hostname}</td>
                    <td class="col">${equipamento.ipaddr}</td>
            </tr>`;
    }
    // fechar a tabela
    strTabela = strTabela + `</tbody>
    </table>`;

    document.getElementById("tabela").innerHTML = strTabela;                             
}


function logout() {
    localStorage.removeItem("userDASH");
    window.location = "index.html";

}
function home() {
    window.location = "relatorios.html";
}