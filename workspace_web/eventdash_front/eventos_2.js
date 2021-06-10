function gerarRelatorio(){
    var txtInicio = document.getElementById("txtInicio").value;
    var txtFim = document.getElementById("txtFim").value;

    /*var msgBody = {
        inicio : txtInicio,
        fim : txtFim
    }

    var cabecalho = {
        method : "POST",
        body : JSON.stringify(msgBody),
        headers : {
            "content-type":"application/json"
        }
    }*/

    //passo3 - enviar para back end
    fetch("http://localhost:8080/eventosporperiodo?inicio="+txtInicio+"&fim="+txtFim).then(resp => trataResposta(resp));

    //passo 4
    function trataResposta(resp){

        if (resp.status == 200){
            //alert(resp.json());
            //var strEventos = JSON.stringify(resp.json());
            //alert(strEventos);
            var strEventos = (resp.json());
            alert(strEventos);
            var lista = JSON.parse(strEventos);
            alert(lista[1]);

            var strtabela = `<table class="table table-hover"><thead><tr><th class="col">#</th><th class="col">Data</th><th class="col">Evento</th><th class="col">Equipamento</th><th class="col">IP</th>`;
            document.getElementById("tabela").innerHTML=strEventos[1].numSeq;
            
            resp.json().then(eventos => {
                localStorage.setItem("eventosPeriodo", JSON.stringify(eventos));
                //window.location = "eventos.html"
            });
        }
        /*else if (resp.status == 404){
            document.getElementById("msg").innerHTML = "Usuário não encontrado";
        }
        else if (resp.status == 403){
            document.getElementById("msg").innerHTML = "Senha inválida";
        }*/
        else{
            document.getElementById("msg").innerHTML = "Erro desconhecido";
        }

        console.log(resp);
    }

}