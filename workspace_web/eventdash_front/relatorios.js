function recuperarInfo(){
    var userStr = localStorage.getItem("userDASH");
    if (!userStr){
        window.location = "index.html";
    }

    var user = JSON.parse(userStr);

    document.getElementById("fotoUser").innerHTML = `<img src="${user.linkFoto}" width="100%">`;
    document.getElementById("bioUser").innerHTML = `<h4>${user.nome}</h4><hr>
            <strong>Racf: </strong> ${user.racf} <br>
            <strong>Email: </strong> ${user.email} <br>
            <strong>Ramal: </strong> ${user.ramal} <br>
            <strong>Departamento: </strong> ${user.departamento}<br>
            <button type="button" class="btn btn-primary" onclick="logout()">logout</button>`;
}

function logout(){
    localStorage.removeItem("userDASH");
    window.location= "index.html";
    
}