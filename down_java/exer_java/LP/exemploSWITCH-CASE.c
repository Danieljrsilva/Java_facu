int main()
{
    int x,y;
    char op;
    
    printf("Operacao (+,*):");
    scanf("%c",&op);
    printf("Valor 1:");
    scanf("%d",&x);
    printf("Valor 2:");
    scanf("%d",&y);
    
    switch(op){
        case '+':
           printf("Soma = %d",x+y);
           break;
        case '*':
           printf("Multiplicacao = %d",x*y);
           break;
        default:
           printf("Operador invalido");
           break;
    }
    return 0;
}