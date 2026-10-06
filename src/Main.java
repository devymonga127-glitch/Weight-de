//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        WeightLossModel model = new WeightLossModel();
        model.CustomerName = "DEVLEENS MONGA ";
        model.WeightLoss = 68.0;

        PrintWeightLoss printWeightLoss = new PrintWeightLoss(model);
        printWeightLoss.Print();
    }


