class Aluno(val nome: String, var matriculado: Boolean) {
    var numeroMatricula: Int = 0
        private set(value) {
            field = value
        }

    init {
        if (matriculado) {
            numeroMatricula = gerarNumeroMatricula()
        }
    }

    private fun gerarNumeroMatricula(): Int {
        // Simulação de geração de número de matrícula
        return (1000..9999).random()
    }
}

class Cadastro {
    val alunos = mutableListOf<Aluno>()

    fun cadastrarAluno(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun listarAlunos() {
        for ((index, aluno) in alunos.withIndex()) {
            println("${index + 1}. Nome: ${aluno.nome}, Matriculado: ${aluno.matriculado}, Número de Matrícula: ${aluno.numeroMatricula}")
        }
    }
}
fun main() {
    val cadastro = Cadastro()


    // Exemplo de uso:
    val aluno1 = Aluno("Matus", true)
    val aluno2 = Aluno("Beatriz", false)
    val aluno3 = Aluno("Dini",true)

    cadastro.cadastrarAluno(aluno1)
    cadastro.cadastrarAluno(aluno2)
    cadastro.cadastrarAluno(aluno3)

    cadastro.listarAlunos()
}