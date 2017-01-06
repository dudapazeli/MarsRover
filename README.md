#MarsRover


O Problema
-------------

  
  O problema Mars Rover consiste em fazer o Rover se mover ao redor do grid. 
  Parametros iniciais:
  
  
* Coordenadas limite do grid (x, y).
* Coordenadas iniciais da posição do Rover (x, y) e sua direção (N, S, L, 0).
* Sequência de comandos que descrevem a movimentação do Rover (L - virar esquerda, R - virar direita, M - andar uma posição)
      
Resultado Esperado:

* Posição Final do Rover (x, y, direção).
    
Implementação
---------------

A solução para o problema foi construida utilizando Java e IDE Eclipse com JUnit e AssertJs para os testes. Além disso, foi utilizado o Maven para gerenciar dependências.

Execução
------------
Exeução da solução:

A execução foi feita utilizando JAVA_HOME = jdk1.8

Dentro da pasta do projeto, executar:
 ```bash
mvn clean install
```
[![Screenshot from 2017-01-06 14:32:34.png](https://s28.postimg.org/a0thly3nx/Screenshot_from_2017_01_06_14_32_34.png)](https://postimg.org/image/adkvs4lxl/)

Dentro da pasta /target/classes, executar:
```bash
java marsRover.Main
```
[![Screenshot from 2017-01-06 16:09:24.png](https://s28.postimg.org/8vqigd8rx/Screenshot_from_2017_01_06_16_09_24.png)](https://postimg.org/image/mcngz8j3d/)

Execução dos testes automatizados:

Os teste foram executados utilizando JAVA_HOME = jdk1.8

Dentro da pasta do projeto, executar:
  ```bash
mvn -Dtest=CoordenadasTeste test

```

[![Screenshot from 2017-01-06 15:29:57.png](https://s24.postimg.org/6s2obpc5h/Screenshot_from_2017_01_06_15_29_57.png)](https://postimg.org/image/jjgui7lxd/)

  ```bash
mvn -Dtest=RoverTeste test
```
[![Screenshot from 2017-01-06 15:30:49.png](https://s28.postimg.org/fs44mvojx/Screenshot_from_2017_01_06_15_30_49.png)](https://postimg.org/image/3q8qsqfbd/)

Execução no eclipse:

Solução:

[![Screenshot from 2017-01-06 16:12:45.png](https://s27.postimg.org/4zishsowj/Screenshot_from_2017_01_06_16_12_45.png)](https://postimg.org/image/y1x2kmb67/)


Testes:

[![Screenshot from 2017-01-06 13:32:19.png](https://s28.postimg.org/ncjm2e5dp/Screenshot_from_2017_01_06_13_32_19.png)](https://postimg.org/image/a8e1ppdbt/)

[![Screenshot from 2017-01-06 13:32:38.png](https://s28.postimg.org/w7zc0svgt/Screenshot_from_2017_01_06_13_32_38.png)](https://postimg.org/image/ehxnfrhvt/)
