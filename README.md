# GymPassTest

O código foi desenvolvido em java, para realizar a compilação, dentro do diretório 
GymPassTest\parent-project
executar o comando mvn clean install

Com isso serão todas as dependências necessárias para o projeto e será gerado o jar para a execução.

Para executar a aplicação, usar o shell para ir até o diretório \parent-project\Batch\target\
Executar o comando:
java -jar Batch-1.0-SNAPSHOT.jar "CAMINHO DO ARQUIVO INPUT"

O arquivo deve estar no formato abaixo.
A pasta raiz do GIT contém um exemplo do arquivo posicional que deve ser utilizado

Para a criação da console, application foi utilizado o SpringBoot para lidar com a injeção das dependências.
A estrutura do projeto foi criada na possibilidade de expandir o código, por exemplo criando novas implementações da interface IFileRaceReader, para ler resultados em CSV ou XML, por exemplo.


O exemplo de saida do console é:

------------------------
- Race Winner - F.MASSA
 - Finish hour - 23:52:17.003
 - Total race time - PT4M11.578S
 - Fastest Lap - - Lap Number - 1- Driver - F.MASSA- Duration - PT1M2.852S

 ------------------------

---- Drivers average speed ------
- Driver - F.MASSA - Average Speed - 44.24249999999999
- Driver - R.BARRICHELLO - Average Speed - 43.464999999999996
- Driver - K.RAIKKONEN - Average Speed - 43.6225
- Driver - M.WEBBER - Average Speed - 43.1875
- Driver - F.ALONSO - Average Speed - 38.0625
- Driver - S.VETTEL - Average Speed - 25.74
 ------------------------

---- All Laps ------
- Lap Number - 1- Driver - F.MASSA- Duration - PT1M2.852S

- Lap Number - 1- Driver - R.BARRICHELLO- Duration - PT1M4.352S

- Lap Number - 1- Driver - K.RAIKKONEN- Duration - PT1M4.108S

- Lap Number - 1- Driver - M.WEBBER- Duration - PT1M4.414S

- Lap Number - 1- Driver - F.ALONSO- Duration - PT1M18.456S

- Lap Number - 2- Driver - F.MASSA- Duration - PT1M3.17S

- Lap Number - 2- Driver - R.BARRICHELLO- Duration - PT1M4.002S

- Lap Number - 2- Driver - K.RAIKKONEN- Duration - PT1M3.982S

- Lap Number - 2- Driver - M.WEBBER- Duration - PT1M4.805S

- Lap Number - 2- Driver - F.ALONSO- Duration - PT1M7.011S

- Lap Number - 3- Driver - F.MASSA- Duration - PT1M2.769S

- Lap Number - 3- Driver - R.BARRICHELLO- Duration - PT1M3.716S

- Lap Number - 3- Driver - K.RAIKKONEN- Duration - PT1M3.987S

- Lap Number - 3- Driver - M.WEBBER- Duration - PT1M4.287S

- Lap Number - 3- Driver - F.ALONSO- Duration - PT1M8.704S

- Lap Number - 1- Driver - S.VETTEL- Duration - PT3M31.315S

- Lap Number - 4- Driver - F.MASSA- Duration - PT1M2.787S

- Lap Number - 4- Driver - R.BARRICHELLO- Duration - PT1M4.01S

- Lap Number - 4- Driver - K.RAIKKONEN- Duration - PT1M3.076S

- Lap Number - 4- Driver - M.WEBBER- Duration - PT1M4.216S

- Lap Number - 4- Driver - F.ALONSO- Duration - PT1M20.05S

- Lap Number - 2- Driver - S.VETTEL- Duration - PT1M37.864S

- Lap Number - 3- Driver - S.VETTEL- Duration - PT1M18.097S

------------------

Exemplo de formato do arquivo de input:

23:49:08.277      038 – F.MASSA                           1     1:02.852                        44,275
23:49:10.858      033 – R.BARRICHELLO                     1     1:04.352                        43,243
23:49:11.075      002 – K.RAIKKONEN                       1     1:04.108                        43,408
23:49:12.667      023 – M.WEBBER                          1     1:04.414                        43,202
23:49:30.976      015 – F.ALONSO                          1     1:18.456                        35,47 
23:50:11.447      038 – F.MASSA                           2     1:03.170                        44,053
23:50:14.860      033 – R.BARRICHELLO                     2     1:04.002                        43,48 
23:50:15.057      002 – K.RAIKKONEN                       2     1:03.982                        43,493
23:50:17.472      023 – M.WEBBER                          2     1:04.805                        42,941
23:50:37.987      015 – F.ALONSO                          2     1:07.011                        41,528
23:51:14.216      038 – F.MASSA                           3     1:02.769                        44,334
23:51:18.576      033 – R.BARRICHELLO                     3     1:03.716                        43,675
23:51:19.044      002 – K.RAIKKONEN                       3     1:03.987                        43,49 
23:51:21.759      023 – M.WEBBER                          3     1:04.287                        43,287
23:51:46.691      015 – F.ALONSO                          3     1:08.704                        40,504
23:52:01.796      011 – S.VETTEL                          1     3:31.315                        13,169
23:52:17.003      038 – F.MASSA                           4     1:02.787                        44,321
23:52:22.586      033 – R.BARRICHELLO                     4     1:04.010                        43,474
23:52:22.120      002 – K.RAIKKONEN                       4     1:03.076                        44,118
23:52:25.975      023 – M.WEBBER                          4     1:04.216                        43,335
23:53:06.741      015 – F.ALONSO                          4     1:20.050                        34,763
23:53:39.660      011 – S.VETTEL                          2     1:37.864                        28,435
23:54:57.757      011 – S.VETTEL                          3     1:18.097                        35,633

